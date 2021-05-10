const name = document.querySelector("#Name");
const firstItem = document.querySelector("#firstItem");
const secondItem = document.querySelector("#secondItem");
const edible = document.querySelector("#edible");
const display = document.querySelector("#display");

const getValues = () => {
    return [String(firstItem.value), String(secondItem.value), String(name.value), String(edible.value)];
}

const printToHistory = (item1, item2, title, edible) => {
    const p = document.createElement("p"); 
    const text = document.createTextNode(`${title} is ${item1} & ${item2} : ${edible}`);

    p.appendChild(text);
    display.appendChild(p);
}


// methods 
const creation = () => {
    const [first, second, NAME, EDIBLE] = getValues();
    printToHistory(first, second, NAME, EDIBLE);
}


const resetValues = () => {
    name.value = "";
    firstItem.value = "";
    secondItem.value = "";
}

const clearHistory = () => {
    display.innerHTML = "";
}