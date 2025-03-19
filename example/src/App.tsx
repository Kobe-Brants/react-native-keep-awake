import { Text, View, StyleSheet } from 'react-native';
import keepAwake from 'react-native-keep-awake';
import { useEffect } from 'react';

export default function App() {
  useEffect(() => {
    keepAwake.activate();
    return keepAwake.deactivate;
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: Keep awake</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
