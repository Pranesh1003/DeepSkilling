import React, { Component } from 'react';

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: '',
      email: '',
      password: '',
      errors: {
        fullName: '',
        email: '',
        password: ''
      }
    };
  }

  validateForm = (errors) => {
    return !Object.values(errors).some(error => error.length > 0);
  };

  handleChange = (event) => {
    const { name, value } = event.target;
    let errors = this.state.errors;

    switch (name) {
      case 'fullName':
        errors.fullName =
          value.length < 5 ? 'Full Name must be 5 characters long!' : '';
        break;
      case 'email':
        const validEmailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        errors.email = validEmailRegex.test(value) ? '' : 'Email is not valid!';
        break;
      case 'password':
        errors.password =
          value.length < 8 ? 'Password must be 8 characters long!' : '';
        break;
      default:
        break;
    }

    this.setState({ errors, [name]: value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    if (this.validateForm(this.state.errors)) {
      alert('Valid Form');
    } else {
      const { fullName, email, password, errors } = this.state;
      if (errors.fullName) alert(errors.fullName);
      if (errors.email) alert(errors.email);
      if (errors.password) alert(errors.password);
    }
  };

  render() {
    const containerStyle = {
      height: '100vh',
      display: 'flex',
      alignItems: 'center',
      justifyContent: 'center',
      fontFamily: 'Arial'
    };

    const formStyle = {
      textAlign: 'center',
      border: '1px solid #ccc',
      padding: '30px',
      borderRadius: '10px',
      backgroundColor: '#fff',
      boxShadow: '0 0 10px rgba(0, 0, 0, 0.1)'
    };

    const inputStyle = {
      padding: '8px',
      margin: '10px 0',
      width: '250px'
    };

    return (
      <div style={containerStyle}>
        <div style={formStyle}>
          <h2 style={{ color: 'red' }}>Register Here!!!</h2>
          <form onSubmit={this.handleSubmit} noValidate>
            <div>
              <label>Name:</label><br />
              <input
                type="text"
                name="fullName"
                onChange={this.handleChange}
                style={inputStyle}
                required
              />
            </div>
            <div>
              <label>Email:</label><br />
              <input
                type="email"
                name="email"
                onChange={this.handleChange}
                style={inputStyle}
                required
              />
            </div>
            <div>
              <label>Password:</label><br />
              <input
                type="password"
                name="password"
                onChange={this.handleChange}
                style={inputStyle}
                required
              />
            </div>
            <button type="submit" style={{ padding: '8px 16px' }}>Submit</button>
          </form>
        </div>
      </div>
    );
  }
}

export default Register;
