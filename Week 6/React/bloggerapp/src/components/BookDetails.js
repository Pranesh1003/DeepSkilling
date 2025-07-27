import React from "react";

function BookDetails({ books }) {
  return (
    <div className="section">
      <h2>Book Details</h2>
      {books.map((book, index) => (
        <div key={index}>
          <h3>{book.title}</h3>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
