import React from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import TrainerList from "./TrainersList";
import TrainerDetails from "./TrainersDetails";
import trainersMock from "./TrainersMock";

function App() {
  return (
    <BrowserRouter>
      <div>
        <nav>
          <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
        </nav>
        <hr />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainerList trainersMock={trainersMock} />} />
          <Route path="/trainer/:id" element={<TrainerDetails trainersMock={trainersMock} />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
