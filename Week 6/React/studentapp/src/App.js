import logo from './logo.svg';
import './App.css';
import Home from './Components/Home';
import About from './Components/About';
import Contact from './Components/Contact';


function App() {
  return (
    <div className="container" style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', marginTop: '50px' }}>
      <Home/>
      <About/>
      <Contact/>
    </div>
  );
}

export default App;
