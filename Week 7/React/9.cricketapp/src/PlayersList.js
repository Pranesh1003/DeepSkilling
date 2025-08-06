import React, { useState } from 'react';

// Sample players data (as per your screenshots)
const players = [
  { name: 'Mr. Sachin', score: 50 },
  { name: 'Mr. Raina', score: 70 },
  { name: 'Mr. Virat', score: 40 },
  { name: 'Mr. Bhuvi', score: 61 },
  { name: 'Mr. Bumrah', score: 61 },
  { name: 'Mr. Rahul', score: 95 },
  { name: 'Mr. Root', score: 100 },
  { name: 'Mr. Smith', score: 84 },
  { name: 'Mr. Jadeja', score: 64 },
  { name: 'Mr. Dhoni', score: 75 },
  { name: 'Mr. Rohit', score: 80 },
];

const IndianTeam = [
  'Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6',
];

const positionLabels = ['First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth'];

const ListofPlayers = ({ players }) => (
  <ul>
    {players.map((p, i) => (
      <li key={i}>{p.name} {p.score}</li>
    ))}
  </ul>
);

const Scorebelow70 = ({ players }) => (
  <ul>
    {players.filter(p => p.score < 70)
      .map((p, i) => (
        <li key={i}>{p.name} {p.score}</li>
      ))
    }
  </ul>
);

const OddPlayers = (team) => (
  <ul>
    {team.filter((_, idx) => idx % 2 === 0).map((name, idx) => (
      <li key={idx}>{positionLabels[idx * 2] || `Player ${idx * 2 + 1}`} : {name}</li>
    ))}
  </ul>
);

const EvenPlayers = (team) => (
  <ul>
    {team.filter((_, idx) => idx % 2 !== 0).map((name, idx) => (
      <li key={idx}>{positionLabels[idx * 2 + 1] || `Player ${idx * 2 + 2}`} : {name}</li>
    ))}
  </ul>
);

const ListofIndianPlayers = ({ IndianPlayers }) => (
  <ul>
    {IndianPlayers.map((_, idx) => (
      <li key={idx}>Mr. {positionLabels[idx] || `Player ${idx + 1}`}</li>
    ))}
  </ul>
);

const PlayersList = () => {
  const [flag] = useState(true); 

  if (flag) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Odd Players</h1>
        {OddPlayers(IndianTeam)}
        <hr />
        <h1>Even Players</h1>
        {EvenPlayers(IndianTeam)}
        <hr />
        <h1>List of Indian Players Merged:</h1>
        <ListofIndianPlayers IndianPlayers={IndianTeam} />
      </div>
    );
  }
};

export default PlayersList;
