import logo from './logo.svg';
import './App.css';
import { Route, Router, Switch } from 'react-router-dom';
import createHistory from 'history/createBrowserHistory'
import Tasks from './components/Tasks';
import Welcome from './components/Welcome';
import Error from './components/ErrorComponent.js'
import Task from './components/Task.jsx';
import FinanceTasks from './components/FinanceTasks';
import FinanceTask from './components/FinanceTask'
import AddTask from './components/AddTask';

function App() {
  return (
    <div className="App">
        
        <Router history = {createHistory()}>       
          <Switch>
              <Route path="/" exact component = {Welcome}/>
              <Route path="/tasks" component = {Tasks}/>
              <Route path="/task" component={Task}/>
              <Route path="/add_task" component={AddTask}/>
              <Route path="/finance" component={FinanceTasks}/>
              <Route path="/finance_task" component={FinanceTask}/>
              <Route path="" component={Error}/>
          </Switch>
        </Router> 
    </div>
  );
}

export default App;
