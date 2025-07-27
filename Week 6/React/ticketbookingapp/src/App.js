import React, { useState } from 'react';

function UserGreeting() {
  return (
    <div>
      <h1>Welcome back</h1>
      <p>You can now book your flight tickets below.</p>
      {/* Example ticket booking form */}
      <form>
        <label>
          Destination:
          <input type="text" placeholder="e.g. Chennai" />
        </label>
        <br />
        <label>
          Date:
          <input type="date" />
        </label>
        <br />
        <button type="submit">Book Ticket</button>
      </form>
    </div>
  );
}

function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>
      <p>Guests can only view flight details. Please login to book.</p>
      {/* Display sample flight data */}
      <ul>
        <li>Flight: ABC | Destination: Trichy | Time: 10:00 AM</li>
        <li>Flight: XYZ | Destination: Madurai | Time: 2:00 PM</li>
      </ul>
    </div>
  );
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <Greeting isLoggedIn={isLoggedIn} />
      <div style={{ marginTop: '20px' }}>
        {isLoggedIn ? (
          <LogoutButton onClick={handleLogoutClick} />
        ) : (
          <LoginButton onClick={handleLoginClick} />
        )}
      </div>
    </div>
  );
}

export default App;
