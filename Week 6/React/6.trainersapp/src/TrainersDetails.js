import React from "react";
import { useParams } from "react-router-dom";

function TrainerDetails({ trainersMock }) {
  const { id } = useParams();
  const trainer = trainersMock.find((t) => t.id === id);

  if (!trainer) {
    return <p>Trainer not found!</p>;
  }

  return (
    <div>
      <h2>{trainer.name}</h2>
      <p>Email: {trainer.email}</p>
      <p>Phone: {trainer.mobile}</p>
      <p>Specialization: {trainer.domain}</p>
      <p>Skills: {trainer.skills.join(", ")}</p>
    </div>
  );
}

export default TrainerDetails;
