const name = document.querySelector("#Name");
const firstItem = document.querySelector("#firstItem");
const secondItem = document.querySelector("#secondItem");
const display = document.querySelector("#display");

const getValues = () => {
    return [String(firstItem.value), String(secondItem.value), String(name.value)];
}

const printToHistory = (item1, item2, result) => {
    const p = document.createElement("p"); 
    const text = document.createTextNode(`${result} is ${item1} & ${item2}`);

    p.appendChild(text);
    display.appendChild(p);
}


// methods 
const creation = () => {
    const [first, second, nam] = getValues();
    printToHistory(first, second, nam);
}


const resetValues = () => {
    firstItem.value = "";
    secondItem.value = "";
}

const clearHistory = () => {
    display.innerHTML = "";
}