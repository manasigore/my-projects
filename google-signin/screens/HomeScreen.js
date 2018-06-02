import React from 'react';
import {
  TouchableOpacity,
  StyleSheet,
  Text,
  View,
  ScrollView,
  Image,
  TextInput,
  Button } from 'react-native';
import { Tile, List, ListItem } from 'react-native-elements';
import { Dropdown } from 'react-native-material-dropdown';
import { Col, Row, Grid } from "react-native-easy-grid";
import { DrawerNavigator } from 'react-navigation';
import StarRating from 'react-native-star-rating';
import { WebBrowser } from 'expo';

import { MonoText } from '../components/StyledText';

import { users } from '../screens/data';


export default class HomeScreen extends React.Component {
  static navigationOptions = {
    title: 'Home',
  };

  onLearnMore = (user) => {
    user.onStarRating = this.setStarRating;
    user.starRating = this.state.ratings[user.key];
    this.props.navigation.navigate('ActivityDetail', user);
  };

  constructor(props) {
    super(props)
    this.results = props.navigation.state.params.results
    this.state = {
      search: '',
      ratings: {},
      permutation: [],
      filterKeyword: null,
      filtertitle: null,
    };

    // Populate permutation array
    for(var i = 0; i < this.results.length; i++) {
    this.state.permutation.push(i)
    }
    // Extract all the keywords from the results
    this.keywords = new Set()
    for(var i = 0; i < this.results.length; i++) {
    if(this.results[i].type) {
      for(var j = 0; j < this.results[i].type.length; j++) {
        this.keywords.add(this.results[i].type[j])
      }
    }
    if(this.results[i].mood) {
      for(var j = 0; j < this.results[i].mood.length; j++) {
        this.keywords.add(this.results[i].mood[j])
      }
    }
    }
    this.keywords = [...this.keywords].sort()
    // Convert keywords into format expected by ModalSelector
    for(var i = 0; i < this.keywords.length; i++) {
    this.keywords[i] =
      { key: i,
        label: this.keywords[i]
      }
    }

    this.titles = new Set()
    for(var i = 0; i < this.results.length; i++) {
    if(this.results[i].type) {
        this.titles.add(this.results[i].title)
      }
    }
    // Make sure 'this' works
    this.eachResult = this.eachResult.bind(this)
    this.matchesKeyword = this.matchesKeyword.bind(this)
    this.matchesTitle = this.matchesTitle.bind(this)
    this.setStarRating = this.setStarRating.bind(this)
    this.matchesSearchBar = this.matchesSearchBar.bind(this)
    }

    setStarRating(rating, key) {
      this.setState(prev => {
        prev.ratings[key] = rating
        return prev
      })
    }

  eachResult(index) {
      const result = this.results[index] // Use permutation array
      const user = result;
      const { navigate } = this.props.navigation;

      return (
        <View >
          <ListItem
                key={user.title}
                roundAvatar
                avatar={{ uri: user.picture.large }}
                title={user.title.toUpperCase()}
                subtitle={
                  <View key={result.key} style={{flexDirection: 'row'}}>
                  <StarRating
                      containerStyle={{width:90}}
                      disabled={true}
                      fullStarColor='#daa520'
                      halfStarEnabled={true}
                      maxStars={5}
                      starSize={15}
                      rating={this.state.ratings[result.key]}
                      />
                  </View>
                }
                subtitleContainerStyle={{paddingLeft: 10}}
                onPress={() => this.onLearnMore(user)}
              />

        </View>
      )
    }

matchesSearchBar(index) {
  const result = this.results[index]
  return result.title.indexOf(
    this.state.search) !== -1;
}

matchesKeyword(index) {
  const result = this.results[index] // Use permutation array
  if(this.state.filterKeyword == null) {
    // not filtering
    return true;
  }
  else if(result.mood.includes(this.state.filterKeyword) ||
          result.type.includes(this.state.filterKeyword)) {
    return true;
  }
  else {
    return false;
  }
}

matchesTitle(index) {
    const result = this.results[index] // Use permutation array
    if(this.state.filtertitle == null) {
      // not filtering
      return true;
    }
    else if(result.title.includes(this.state.filtertitle)){
      return true;
    }

    else {
      return false;
    }
  }

render() {
    const { navigate } = this.props.navigation;

    return (
      <View style={styles.container}>
        <ScrollView>
          <View style={styles.container}>
            <TextInput placeholder = 'Search Text'
                      style={{textAlign: 'center', height: 40, borderWidth: 2}}
                      value={this.state.search}
                      onChangeText={(search) => this.setState({search})}/>

            <Text style={styles.txt}> FILTER BY </Text>

            <Grid style={{marginTop:5, marginBottom:5}}>

              <Row>
                <Col style={{width:'50%'}}>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'dessert'})} >
                    <Text>Dessert</Text>
                  </TouchableOpacity>
                </Col>
                <Col>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'coffee'})} >
                    <Text>Coffee</Text>
                  </TouchableOpacity>
                </Col>
              </Row>
              <Row>
                <Col style={{width:'50%'}}>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'dining'})} >
                    <Text>Dining</Text>
                  </TouchableOpacity>
                </Col>
                <Col>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'outdoor seating' })} >
                    <Text>Outdoor seating</Text>
                  </TouchableOpacity>
                </Col>
              </Row>
              <Row>
                <Col style={{width:'50%'}}>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'relax' })} >
                    <Text>Relax</Text>
                  </TouchableOpacity>
                </Col>
                <Col>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'fitness'})}>
                    <Text>Fitness</Text>
                  </TouchableOpacity>
                </Col>
              </Row>
              <Row>
                <Col style={{width:'50%'}}>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'internet' })} >
                    <Text>Internet</Text>
                  </TouchableOpacity>
                </Col>
                <Col style={{width:'50%'}}>
                  <TouchableOpacity style={styles.buttonStyle}
                    onPress={filterKeyword => this.setState({filterKeyword: 'adventure' })} >
                    <Text>Adventure</Text>
                  </TouchableOpacity>
                </Col>
              </Row>
            </Grid>
            <TouchableOpacity style={styles.clear}
              onPress={filterKeyword => this.setState({filterKeyword: null })} >
              <Text>Clear</Text>
            </TouchableOpacity>
            <List>
              {this.state.permutation.filter(this.matchesSearchBar).filter(this.matchesKeyword).filter(this.matchesTitle).map(this.eachResult)}
            </List>

          </View>
        </ScrollView>
      </View>
    );
  }

  _maybeRenderDevelopmentModeWarning() {
    if (__DEV__) {
      const learnMoreButton = (
        <Text onPress={this._handleLearnMorePress} style={styles.helpLinkText}>
          Learn more
        </Text>
      );

      return (
        <Text style={styles.developmentModeText}>
          Development mode is enabled, your app will be slower but you can use useful development
          tools. {learnMoreButton}
        </Text>
      );
    } else {
      return (
        <Text style={styles.developmentModeText}>
          You are not in development mode, your app will run at full speed.
        </Text>
      );
    }
  }

  _handleLearnMorePress = () => {
    WebBrowser.openBrowserAsync('https://docs.expo.io/versions/latest/guides/development-mode');
  };

  _handleHelpPress = () => {
    WebBrowser.openBrowserAsync(
      'https://docs.expo.io/versions/latest/guides/up-and-running.html#can-t-see-your-changes'
    );
  };
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },

  buttonStyle: {
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'row',
    borderColor: 'black',
    borderWidth: 1,
    padding: 8,
    borderRadius: 5,
  },

  textinput: {
    textAlign: 'center',
    marginTop: 10,
    marginBottom: 5,
    padding: 5,
    backgroundColor:'#ff0',
  },

  clear: {
    borderWidth: 4,
    borderRadius: 4,
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'row',
  },

  txt: {
    textAlign: 'center',
    fontWeight: 'bold',
    fontSize: 15,
    marginTop: 10,
    marginBottom: 5,
  },

  dropdown_1: {
    justifyContent: 'center',
    alignItems: 'center' ,
  },

  location: {
    position:'relative',
    marginTop: 0,
    marginBottom: 10,
    padding:4,
    width: 'auto',
    height: 200,
  },
  });
