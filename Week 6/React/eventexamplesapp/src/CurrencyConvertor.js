import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = () => {
    if (currency.toLowerCase() === 'euro') {
      const converted = amount * 80;
      alert(`Converting to Euro Amount is ₹${converted}`);
    } else {
      alert('Currency not supported!');
    }
  };

  return (
    <div style={{ marginTop: '40px' }}>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <label>
        Amount:
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
      </label>
      <br />
      <label>
        Currency:
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />
      </label>
      <br />
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default CurrencyConvertor;
