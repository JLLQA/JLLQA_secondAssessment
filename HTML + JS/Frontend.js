const name = document.querySelector("#Name");
const firstNumber = document.querySelector("#firstNumber");
const secondNumber = document.querySelector("#secondNumber");
const result = document.querySelector('#result');
const display = document.querySelector("#display");

const getValues = () => {
    return [Number.parseFloat(firstNumber.value), Number.parseFloat(secondNumber.value)];
}

const printToHistory = (num1, num2, operator, result) => {
    const p = document.createElement("p"); 
    const text = document.createTextNode(`${num1} ${operator} ${num2} = ${result}`);

    p.appendChild(text);
    display.appendChild(p);
}


// methods 
const add = () => {
    const [first, second] = getValues();
    const computation = first + second;
    result.value = computation;
    printToHistory(first, second, "+", computation);
}


const resetValues = () => {
    firstNumber.value = "";
    secondNumber.value = "";
    result.value = "";
}

const clearHistory = () => {
    display.innerHTML = "";
}