import { NativeModules } from 'react-native';

const { KeepAwake } = NativeModules;

// Create a React component for declarative usage
import { Component } from 'react';

class KeepAwakeComponent extends Component {
  componentDidMount() {
    KeepAwake.activate();
  }

  componentWillUnmount() {
    KeepAwake.deactivate();
  }

  render() {
    return null;
  }
}

export default {
  activate: () => KeepAwake.activate(),
  deactivate: () => KeepAwake.deactivate(),
  KeepAwake: KeepAwakeComponent,
};
