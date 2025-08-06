import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  return (
    <div>
      <CohortDetails name="INTADMDF10 -.NET FSD" StartedOn = "22-Feb-2022" CurrentStatus="Scheduled" Coach="Aathma" Trainer="Jojo Jose"/>
      <CohortDetails name="ADM21JF014 - Java FSD" StartedOn ="10-Sep-2021" CurrentStatus="Ongoing" Coach="Apoorv" Trainer="Elisa Smith"/>
      <CohortDetails name="CDBJF21025" StartedOn ="24-Dec-2021" CurrentStatus="Ongoing" Coach="Aathma" Trainer="John Doe"/>
    </div>
  );
}

export default App;
""