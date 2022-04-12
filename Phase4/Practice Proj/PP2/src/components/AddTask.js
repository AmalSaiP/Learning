import React, { Component } from 'react'
import APICallsService from '../APICallsService'

export default class AddTask extends Component {
    constructor(props){
        super(props)
        this.state={
            id: '',
            client:  '',
            project: '',
            cost: ''
        }
        this.handleSubmit = this.handleSubmit.bind(this)
        this.clientChange = this.clientChange.bind(this)
        this.projectChange = this.projectChange.bind(this)
        this.costChange= this.costChange.bind(this)
    }


    handleSubmit(){

        let id = this.state.id;
        let client = this.state.client;
        let project = this.state.project;
        let cost = this.state.cost;
        

        APICallsService.createTask({

            client: client,
            project: project,
            cost: cost,
            id: id  
        }).then(response => {
        alert("Create successful!") 
        this.props.history.push('/tasks')})

    
        
        
    }

    clientChange(event){
        this.setState({client: event.target.value})
    }

    projectChange(event){
        this.setState({project: event.target.value})
    }
    
    costChange(event){

        let cost = event.target.value
        
        if(cost === ''){
            this.setState({cost: event.target.value})
        }
        if(!Number(cost)){
            return;
        }

        this.setState({cost: event.target.value})
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
                    <div className="form-group">
                        <h1 htmlFor="formGroupExampleInput2">Cost</h1>
                        <input type="text" className="form-control"  name="cost" value={this.state.cost} onChange={this.costChange}/>
                    </div>
                    <button className="btn btn-success"  type="button" onClick={() => this.handleSubmit()}>Create</button>
                </form>
                
                <div style={{paddingTop:"10px"}}><button className="btn btn-primary" onClick={() => this.props.history.push("/tasks")}>Return To List</button></div>
             </div>
             </>
            
        )
    }
}
