import React from "react";
import { Link } from "react-router-dom";
import trainersMock from "./Trainersmock";

function TrainerList({trainer}) {
    return (
        <div>
            <h2>Trainer List</h2>
            <ul>
                {trainersMock.map((trainer) => (
                    <li key={trainer.trainerID}>
                        <Link to={`/trainer/${trainer.trainerID}`}>{trainer.name}</Link>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default TrainerList;