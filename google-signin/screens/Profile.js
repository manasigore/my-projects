import React from 'react';
import Expo from 'expo';
import { ScrollView } from 'react-native';
import { Tile, List, ListItem, Button } from 'react-native-elements';
import { me } from '../screens/data';

export default class Profile extends React.Component {
  static navigationOptions = {
    title: 'Profile',
  };

  handleSettingsPress = () => {
    this.props.navigation.navigate('Settings');
  };

  render() {
    return (
      <ScrollView style={{marginTop: 30}}>
        <Tile
          imageSrc={require('../screens/IMG_2059.jpg')}
          featured
          title={`${this.props.name.first.toUpperCase()} ${this.props.name.last.toUpperCase()}`}
          caption={this.props.email}
        />

        <Button
          title="Settings"
          buttonStyle={{ marginTop: 20 }}
          onPress={this.handleSettingsPress}
        />

        <List>
          <ListItem
            title="Email"
            rightTitle={this.props.email}
            hideChevron
          />
          <ListItem
            title="Phone"
            rightTitle={this.props.phone}
            hideChevron
          />
        </List>

        <List>
          <ListItem
            title="Username"
            rightTitle={this.props.login.username}
            hideChevron
          />
        </List>

        <List>
          <ListItem
            title="Birthday"
            rightTitle={this.props.dob}
            hideChevron
          />
          <ListItem
            title="City"
            rightTitle={this.props.location.city}
            hideChevron
          />
        </List>
      </ScrollView>
    );
  }
}

Profile.defaultProps = { ...me };
