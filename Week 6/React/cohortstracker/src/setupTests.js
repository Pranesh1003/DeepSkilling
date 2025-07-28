import '@testing-library/jest-dom';

const { TextEncoder, TextDecoder } = require('util');

if (typeof global.TextEncoder === 'undefined') {
  global.TextEncoder = TextEncoder;
}
if (typeof global.TextDecoder === 'undefined') {
  global.TextDecoder = TextDecoder;
}

global.MessagePort = class {}; 

try {
  const { ReadableStream } = require('stream/web');
  if (typeof global.ReadableStream === 'undefined') {
    global.ReadableStream = ReadableStream;
  }
} catch (error) {
  console.warn('Could not polyfill ReadableStream:', error.message);
}

// Enzyme setup
require('@testing-library/jest-dom');
const { configure } = require('enzyme');
const Adapter = require('enzyme-adapter-react-16');

configure({ adapter: new Adapter() });
