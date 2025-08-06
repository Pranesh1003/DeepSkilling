import React from 'react';
import './App.css';

const OfficeSpaceRentalApp = () => {
  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "/images.jpeg"
    },
    {
      Name: "MS",
      Rent: 65000,
      Address: "Coimbatore",
      Image: "MS.jpeg"
    },
    {
      Name: "SmartWork",
      Rent: 45000,
      Address: "Hyderabad",
      Image: "SmartWork.jpeg"
    },
    {
      Name: "Worky",
      Rent: 70000,
      Address: "Mumbai",
      Image: "Worky.jpeg"
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>{heading}, at Affordable Range</h1>

      {officeList.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? 'red' : 'green';

        return (
          <div key={index} style={{ marginBottom: '40px' }}>
            <img src={item.Image} width="25%" height="25%" alt={item.Name} />
            <h2>Name: {item.Name}</h2>
            <h3 style={{ color: rentColor }}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
};

export default OfficeSpaceRentalApp;

