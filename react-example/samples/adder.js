ReactDOM.render (
	<Adder n1={2} n2={4}/>,
	document.getElementById('app')
);

function Adder({n1, n2}){
	const sum = n1 + n2;
	return <h1>{sum}</h1>;
}