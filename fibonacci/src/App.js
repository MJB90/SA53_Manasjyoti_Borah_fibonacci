import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome'
function App() {
  return (
    <div className="App" style={{ backgroundImage: "url(https://ibb.co/ZT4FSBW)" , backgroundPosition: 'center',
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat' }}>
      <h1>Generate Fibonacci Numbers</h1>
    <Welcome></Welcome>
    </div>
  );
}

export default App;
