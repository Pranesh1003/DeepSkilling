import React, { Component } from 'react';

class CountPeople extends Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  }

  updateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  }

  render() {
    return (
      <div style={{display: "flex", justifyContent: "center", alignItems: "center", height: "80vh"}}>
        <div style={{marginRight: 80}}>
          <button 
            style={{backgroundColor: "lightgreen", border: "1px solid green", padding: "5px 10px", borderRadius: "5px"}}
            onClick={this.updateEntry}
          >
            Login
          </button>
          <span style={{marginLeft: 10, fontWeight: "bold"}}>{this.state.entrycount} People Entered!!!</span>
        </div>
        <div>
          <button 
            style={{backgroundColor: "lightgreen", border: "1px solid green", padding: "5px 10px", borderRadius: "5px"}}
            onClick={this.updateExit}
          >
            Exit
          </button>
          <span style={{marginLeft: 10, fontWeight: "bold"}}>{this.state.exitcount} People Left!!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;
