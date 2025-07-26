import React from "react";
import { Link } from "react-router-dom";

function TrainerList({ trainersMock }) {
  return (
    <div>
      <h2>Trainer List</h2>
      <ul>
        {trainersMock.map((trainer) => (
          <li key={trainer.id}>
            <Link to={`/trainer/${trainer.id}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerList;
