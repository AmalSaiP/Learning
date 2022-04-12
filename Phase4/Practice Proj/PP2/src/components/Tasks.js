import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import APICallsService from '../APICallsService';

export default class Tasks extends Component {
    
    constructor(props){
        super(props);
        this.state = {
            taskList: []
        }

        this.getData = this.getData.bind(this);
        this.deleteTodo = this.deleteTodo.bind(this);
    }

    getData(){
        APICallsService.getAllTasks().then(response =>{
            this.setState({taskList: response.data})
            console.log(response.date)
            console.log(response.data[0].client)
        }).catch(error => {
            this.forceUpdate()
        })
    }

    deleteTodo(id){
        console.log("hello!")
        console.log(id);
        APICallsService.deleteTaskById(id).then(response => {
            console.log(response)
            this.getData()
        })
    }

    componentDidMount(){
        this.getData()
        //console.log(this.state.taskList)
    }

    componentDidUpdate(){
        console.log(this.state.taskList)
    }

    componentWillUnmount(){

    }
    
    render() {

        let count = 0;
        return (
            <div>
                <h1 className="jumbotron">Product Manager View</h1>
                <div className="container">
                    <table className="table table-striped">
                        <thead className="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>VENDOR</th>
                                <th>PROJECT</th>
                                <th>COST</th>
                                <th>UPDATE</th> 
                                <th>DELETE</th>                         
                            </tr>
                        </thead>
                        <tbody>
                            {           
                                this.state.taskList.map(
                                    deal => 
                                            <tr key = {deal.id}>
                                                <td>{count += 1}</td>
                                                <td>{deal.client}</td>
                                                <td>{deal.project}</td>
                                                <td>{deal.cost}</td>
                                                <td><button className="btn btn-success" onClick={() => this.props.history.push({
                                                    pathname: '/task',
                                                    state: {id: deal.id, client: deal.client, project: deal.project, cost: deal.cost}
                                                })}>Update</button></td>
                                                <td><button className="btn btn-danger" onClick={() => this.deleteTodo(deal.id)}>Delete</button></td>                                         
                                            </tr>
                                )
                            }
                        </tbody>
                    </table>
                    <div><button className="btn btn-success" onClick={() => this.props.history.push('/add_task')}> Add </button></div>
                    <div><button className="btn btn-primary" style={{marginTop: "10px"}}  onClick={() => this.props.history.push('/')}>Return To Welcome Page</button></div>
                    
                    {/* <button className="btn btn-dark">Create New Task</button> */}
                    
                </div>
            </div>
        )
    }
}
