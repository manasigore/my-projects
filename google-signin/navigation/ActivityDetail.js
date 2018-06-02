import React from 'react';
import { ScrollView, StyleSheet, Text, Image, View, TouchableOpacity } from 'react-native';
import { Tile, List, ListItem } from 'react-native-elements';
import { Col, Row, Grid } from "react-native-easy-grid";
import MapView from 'react-native-maps';
import StarRating from 'react-native-star-rating';

class ActivityDetail extends React.Component {
  static navigationOptions = ({navigation}) => ({
    title: navigation.state.params.title
  })

  constructor(props) {
  super(props)
  this.state = {rating: props.navigation.state.params.starRating}
  };

  onStarRatingPress(rating) {
  console.log(rating)
  this.setState(prev => {0
    return {...prev, rating: rating}
  })
  this.props.navigation.state.params.onStarRating(
      rating,
      this.props.navigation.state.params.key
    )
  }


  render() {
    const { key, title, author, type, minPrice, avgPrice, timeNeededMinutes, mood, description, picture, latitude, longitude } = this.props.navigation.state.params;

    var grid = []

    if(title && title.length > 0) {
    grid.push({key: 'title',
               heading: 'Title',
               value: ': ' + title})
    }

    if(minPrice && avgPrice) {
    grid.push({key: 'prices',
               heading: 'Price Range',
               value: ': $' + minPrice.toFixed(2) + ' – $' + avgPrice.toFixed(2)})
    }

    if(type && type.length > 0) {
    grid.push({key: 'type',
               heading: 'Experience Type',
               value: ': ' + type.join(', ')})
    }

    if(timeNeededMinutes && timeNeededMinutes > 0) {
    grid.push({key: 'time',
               heading: 'Time Needed',
               value: ': ' + timeNeededMinutes + ' minutes'})
    }

    if(mood && mood.length > 0) {
    grid.push({key: 'mood',
               heading: 'Moods',
               value: ': ' + mood.join(', ')})
    }

    return (
      <View style={styles.container}>

        <ScrollView>

        <MapView style={styles.location}
          region={{
          latitude: latitude,
          longitude: longitude,
          latitudeDelta: 0.1,
          longitudeDelta: 0.1

          }}
          >
          <MapView.Marker
          coordinate={{
          latitude: latitude,
          longitude: longitude
          }}

          title={title}
          />

        </MapView>

          <Tile
            style={{marginTop:5, marginBottom:5}}
            imageSrc={{ uri: picture.large}}
            featured
            title={author.toUpperCase()}
          />
            <Grid style={{marginTop:5, marginBottom:5}}>

              {grid.map((x,i) =>

                <Row key={'gk_'+x.key} style={i%2==0? styles.even : styles.odd}>
                  <Col style={{width:'35%'}}>
                    <Text style={{fontWeight:'bold'}}>{x.heading}</Text>
                  </Col>
                  <Col>
                    <Text>{x.value}</Text>
                  </Col>
                </Row>)
              }

            </Grid>

            <Text style={{fontWeight:'bold'}}>Description : </Text>
            <Text>{description}</Text>
            <View style={{flexDirection:'row', alignItems:'center', marginTop:15}}>
              <TouchableOpacity style={{padding:5}}
                                onPress={() => this.onStarRatingPress(0)}>
                <Text style={{fontSize: 24, color:this.state.rating > 0? '#cd1a1a' : '#ccc'}}>×</Text>
              </TouchableOpacity>
              <StarRating
                              disabled={false}
                              fullStarColor='#daa520'
                              halfStarEnabled={true}
                              maxStars={5}
                              rating={this.state.rating}
                              buttonStyle={{padding:5}}
                              selectedStar={(rating) => this.onStarRatingPress(rating)}
                              />

            </View>
            <Text style={{fontWeight:'bold'}}>User Ratings : </Text>

        </ScrollView>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex:1,
    width:'100%',
    padding:5,
    backgroundColor:'#fff',
  },

  location: {
    position:'relative',
    marginTop: 0,
    marginBottom: 5,
    padding:4,
    width: 'auto',
    height: 200,
  },

  img: {
    flex:1,
    width: 'auto',
    height: 200,
    marginTop:15,
    marginBottom:15,
  },

  gifImg: {
    width: 100,
    height: 50,
    backgroundColor:'#D6EAF8',
    marginTop:12,
  },

  odd: {
    marginBottom: 2,
  },
  even: {
    marginBottom: 2,
    backgroundColor: '#D6EAF8',
  },
});

export default ActivityDetail;
