import React, { Component } from 'react'

class Welcome extends React.Component {
    constructor(props) {
        super(props);
        this.state = {value: '',
                        fibonacci: '',
                        sorted: ''};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    handleSubmit(event) {
        const recipeUrl = 'http://localhost:7070/resource/fibonacci';

        const elements = this.state.value.toString();
        const newUrl = recipeUrl + "?" + "elements" + "=" + elements


        fetch(newUrl)
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        fibonacci : result.fibonacci,
                        sorted : result.sorted
                    });
                }
            );

        //alert('Fibonacci :' + this.state.fibonacci + '\nSorted :' + this.state.sorted);
        event.preventDefault();
    }
    render() {
        const { response } = this.state;
        return (
            <form onSubmit={this.handleSubmit}>
                <label>
                    Name:
                    <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label>
                <br/>
                <br/>
                <br/>
                <label>
                    Fibonacci:
                    <textarea value={this.state.fibonacci} onChange={this.handleChange} rows="4" cols="200"/>
                </label>
                <br/>
                <br/>
                <br/>
                <label>
                    Sorted:
                    <textarea value={this.state.sorted} onChange={this.handleChange} rows="4" cols="200"/>
                </label>
                <br/>
                <br/>
                <br/>
                <input type="submit" value="Submit" />
            </form>

        );
    }
}
export  default Welcome