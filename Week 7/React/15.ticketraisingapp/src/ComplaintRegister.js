import React, { Component } from 'react';

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      ename: '',
      complaint: '',
      NumberHolder: Math.floor(Math.random() * 100) + 1
    };
  }

  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  };

  handleSubmit = (event) => {
    const msg = `Thanks ${this.state.ename}\nYour Complaint was Submitted.\nTransaction ID is: ${this.state.NumberHolder}`;
    alert(msg);
    event.preventDefault();
  };

  render() {
    const outerContainerStyle = {
      height: '100vh',
      width: '100vw',
      display: 'flex',
      justifyContent: 'center',
      alignItems: 'center',
      fontFamily: 'Arial',
      backgroundColor: '#f8f8f8'
    };

    const formContainerStyle = {
      backgroundColor: '#fff',
      padding: '30px 40px',
      borderRadius: '12px',
      boxShadow: '0 0 10px rgba(0,0,0,0.1)',
      textAlign: 'center'
    };

    const labelStyle = {
      display: 'inline-block',
      width: '90px',
      textAlign: 'right',
      marginRight: '10px',
      fontWeight: 'bold'
    };

    const formRowStyle = {
      margin: '12px 0',
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center'
    };

    const inputStyle = {
      padding: '8px',
      width: '250px'
    };

    return (
      <div style={outerContainerStyle}>
        <div style={formContainerStyle}>
          <h2 style={{ color: 'red', marginBottom: '20px' }}>
            Register your complaints here!!!
          </h2>
          <form onSubmit={this.handleSubmit}>
            <div style={formRowStyle}>
              <label style={labelStyle}>Name:</label>
              <input
                type="text"
                name="ename"
                value={this.state.ename}
                onChange={this.handleChange}
                style={inputStyle}
                required
              />
            </div>
            <div style={formRowStyle}>
              <label style={labelStyle}>Complaint:</label>
              <textarea
                name="complaint"
                value={this.state.complaint}
                onChange={this.handleChange}
                rows="3"
                style={{ ...inputStyle, height: '60px' }}
                required
              />
            </div>
            <div style={formRowStyle}>
              <button type="submit" style={{ padding: '8px 16px' }}>
                Submit
              </button>
            </div>
          </form>
        </div>
      </div>
    );
  }
}

export default ComplaintRegister;
