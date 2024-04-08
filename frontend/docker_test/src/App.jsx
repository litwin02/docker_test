import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import axios from 'axios'
import './App.css'

function App() {
  const [data, setData] = useState([]);
  const [showTable, setShowTable] = useState(false);

  const fetchData = async () => {
    try {
      const response = await axios.get("http://localhost:8080/items");
      setData(response.data);
      setShowTable(true);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  

  return (
    <>
      <h1>TEST OF DOCKER</h1>
      <h3>Click this button to get data from backend!</h3>
      <button onClick={fetchData}>Get Data</button>
      {showTable && (
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {data.map(item => (
              <tr key={item.id}>
                <td>{item.id}</td>
                <td>{item.name}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </>
  )
}

export default App
