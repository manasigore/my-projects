import React from 'react';
import Expo from 'expo';
import { ScrollView, View, StyleSheet, TouchableOpacity, Text, Image } from 'react-native';
import { Col, Row, Grid } from "react-native-easy-grid";

export default class LoginScreen extends React.Component {
  static navigationOptions = {
    title: 'WANDERLUST',
  };

  async signInWithGoogleAsync() {
      try {
        const result = await Expo.Google.logInAsync({
          iosClientId: '970548274798-11igt4u60gtkj8itkd7n8ifvqooqf7ar.apps.googleusercontent.com',
          scopes: ['profile', 'email'],
        });

        if (result.type === 'success') {
          this.props.navigation.navigate('Main');
          return result.accessToken;
        } else {
          return {cancelled: true};
        }
      } catch(e) {
        return {error: true};
    }
  }

  render() {
    return (
      <ScrollView>
        <View style={styles.container}>
          <Image
            style={{width: '100%', height: 300}}
            source={{uri:'http://www.amadeus.com/msite/global-report/2014/en/img/3_anim_4.gif'}}
          />
          <Text style={styles.textStyle}> SIGN IN WITH </Text>
          <TouchableOpacity style={styles.buttonStyle} onPress={this.signInWithGoogleAsync.bind(this)}>
            <Text style={styles.textButtonStyle}>Google +</Text>
          </TouchableOpacity>
        </View>

      </ScrollView>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#fff',
  },
  buttonStyle: {
    padding: 8,
    backgroundColor: '#F00',
    borderRadius: 5
  },
  fbStyle: {
    padding: 8,
    backgroundColor: '#3b5998',
    borderRadius: 5
  },
  guestStyle: {
    padding: 8,
    backgroundColor: '#000',
    borderRadius: 5
  },
  textButtonStyle: {
    justifyContent: 'center',
    fontSize: 15,
    fontWeight: 'bold',
    color: '#FFF'
  },
  textStyle: {
    fontSize: 30,
    fontWeight: 'bold',
    color: '#000'
  }
});
