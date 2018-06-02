import React from 'react';
import { Platform } from 'react-native';
import { Ionicons } from '@expo/vector-icons';
import { TabNavigator, TabBarBottom, StackNavigator } from 'react-navigation';

import Colors from '../constants/Colors';

import HomeScreen from '../screens/HomeScreen';
import Profile from '../screens/Profile';
import Settings from '../screens/Settings';
import ActivityDetail from '../navigation/ActivityDetail';
import { users } from '../screens/data';

export const FeedStack = StackNavigator ({
  ActivityDetail: {
    screen: ActivityDetail,
    navigationOptions: ({ navigation }) => ({
      title: navigation.state.params.title.toUpperCase(),
    }),
  },
  Settings: {
    screen: Settings,
    navigationOptions: {
      title: 'Settings',
    },
  },
});

export default TabNavigator(
  {
    Home: {
      screen: HomeScreen,
    },
    Profile: {
      screen: Profile,
    },
  },
  {
    initialRouteName: 'Home',
    initialRouteParams: {results: users},
    navigationOptions: ({ navigation }) => ({
      tabBarIcon: ({ focused }) => {
        const { routeName } = navigation.state;
        let iconName;
        switch (routeName) {
          case 'Home':
            iconName =
              Platform.OS === 'ios'
                ? `ios-list${focused ? '' : '-outline'}`
                : 'md-list';
            break;
          case 'Profile':
            iconName =
              Platform.OS === 'ios'
                ? `ios-contact${focused ? '' : '-outline'}`
                : 'md-contact';
        }
        return (
          <Ionicons
            name={iconName}
            size={28}
            style={{ marginBottom: -3, width: 25 }}
            color={focused ? Colors.tabIconSelected : Colors.tabIconDefault}
          />
        );
      },
    }),
    tabBarComponent: TabBarBottom,
    tabBarPosition: 'bottom',
    animationEnabled: false,
    swipeEnabled: false,
  }
);
