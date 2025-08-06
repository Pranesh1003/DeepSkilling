import React from "react";
import styles from "./cohortdetais.module.css"; 

function CohortDetails({ name, StartedOn, CurrentStatus, Coach, Trainer }) {
  const statusColor = CurrentStatus === "Ongoing" ? "green" : "blue"; 

  return (
    <div className={styles.box}> 
      <h3 style={{ color: statusColor }}>{name}</h3> 
      <dl>
        <dt>StartedOn</dt>
        <dd>{StartedOn}</dd>
        <dt>CurrentStatus</dt>
        <dd>{CurrentStatus}</dd>
        <dt>Coach</dt>
        <dd>{Coach}</dd>
        <dt>Trainer</dt>
        <dd>{Trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
