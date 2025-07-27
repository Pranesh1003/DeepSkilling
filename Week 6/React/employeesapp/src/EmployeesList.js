import React, { Component } from 'react';
import EmployeeCard from './EmployeeCard';

class EmployeesList extends Component {
  state = {
    employees: [
      { id: 1, name: 'Akil', role: 'Developer' },
      { id: 2, name: 'Bobi', role: 'Designer' }
    ]
  };

  render() {
    return (
      <div>
        {this.state.employees.map((emp) => (
          <EmployeeCard key={emp.id} employee={emp} />
        ))}
      </div>
    );
  }
}

export default EmployeesList;
