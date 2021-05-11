import logo from './logo.svg';
import './App.css';
import React,{useState} from 'react';

function App(){
  const [data, setData] = useState('');

  const getData = () =>{
    fetch('http://localhost:8080/apitest/login/all.json')
    .then(response => response.text())
    .then(data => setData(data));
  }

  getData();
  return(
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          {data}
        </p>
      </header>
    </div>
  )
}

export default App;
