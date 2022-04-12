import React, { Component } from 'react'
import APICallsService from '../APICallsService'

export default class Task extends Component {
    
    constructor(props){
        super(props)

        this.state={
            id: '',
            client:  '',
            project: ''
        }
        this.handleSubmit = this.handleSubmit.bind(this)
        this.clientChange = this.clientChange.bind(this)
        this.projectChange = this.projectChange.bind(this)
    }

    componentDidMount(){


        if(this.props.location.state === undefined){

            this.props.history.push('/tasks')
        }else{
            this.setState({client: this.props.location.state.client, project: this.props.location.state.project, id: this.props.location.state.id})
        }

    }

    handleSubmit(){
        console.log(this.state.id)
        console.log(this.state.client)

        let id = this.state.id;
        let client = this.state.client;
        let project = this.state.project;
        
        console.log("hi")

        APICallsService.updateTask(id,{
            
            client: client,
            project: project  
        }).then(response => {
        alert("Update successful!") 
        this.props.history.push('/tasks')})   
    }

    clientChange(event){

        this.setState({client: event.target.value})
        console.log(this.state.client)

    }

    projectChange(event){
        this.setState({project: event.target.value})
        console.log(this.state.project)
    }
    
    
    render() {
        return (
            <>
             <div className="form-group" style={{width: "50%", display:"inline-block"}}>
                <form>
                   <div className="form-group">
                        <h1 htmlFor="formGroupExampleInput">Vendor</h1>
                        <input type="text" className="form-control" name="client" value={this.state.client}  onChange={this.clientChange}/ >
                   </div>
                    <div className="form-group">
                        <h1 htmlFor="formGroupExampleInput2">Project</h1>
                        <input type="text" className="form-control"  name="project" value={this.state.project} onChange={this.projectChange}/>
                    </div>
                    <button className="btn btn-success"  type="button" onClick={() => this.handleSubmit()}>Submit Changes</button>
                </form>
                
                <div style={{paddingTop:"10px"}}><button className="btn btn-primary" onClick={() => this.props.history.push("/tasks")}>Return To List</button></div>
             </div>
             </>
            
        )
    }
}
