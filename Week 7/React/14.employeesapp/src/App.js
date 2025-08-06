import React, { Component } from 'react';
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext';

class App extends Component {
  state = {
    theme: 'light' 
  };

  render() {
    return (
      <ThemeContext.Provider value={this.state.theme}>
        <div>
          <h1>Employee Management</h1>
          <EmployeesList />
        </div>
      </ThemeContext.Provider>
    );
  }
}

export default App;
