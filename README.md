# react-native-keep-awake

Keep device screen awake for React Native

## Installation

```sh
npm install @kobe-brants/react-native-keep-awake
```

## Usage


```js
import KeepAwake from '@kobe-brants/react-native-keep-awake';

useEffect(() => {
  KeepAwake.activate();

  return () => {
    KeepAwake.deactivate();
  };
}, []);
```


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
