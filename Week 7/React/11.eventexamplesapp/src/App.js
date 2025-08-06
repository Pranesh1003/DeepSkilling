import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const sayHello = () => {
    alert("Hello Member1!");
  };

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleOnPress = (event) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
      <br />
      <button onClick={handleOnPress}>Click on me</button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;
