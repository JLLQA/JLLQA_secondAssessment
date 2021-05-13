'use strict'
const NAME = document.querySelector("#Name");
const FIRSTITEM = document.querySelector("#firstItem");
const SECONDITEM = document.querySelector("#secondItem");
const EDIBLE = document.querySelector("#edible");

const UNAME = document.querySelector("#uName");
const UFIRSTITEM = document.querySelector("#uFirstItem");
const USECONDITEM = document.querySelector("#uSecondItem");
const UEDIBLE = document.querySelector("#uEdible");
const UPDATE = document.querySelector("#update");

const DELETE = document.querySelector("#delete");
const ALERT = document.querySelector("#onSuccess");
const DISPLAY = document.querySelector("#display");

axios
    .get("http://localhost:8080/getAll", {
        "headers": {
            "Access-Control-Allow-Origin": "*"
        }
    })
    .then((response) => {
        console.log(response);
        for (let data of response.data) {
            printToScreen(data);
        }
    })
    .catch((err) => {
        console.error(err);
    });

const createBM = () => {

    const NAME_VALUE = NAME.value;
    const FIRST_VALUE = FIRSTITEM.value;
    const SECOND_VALUE = SECONDITEM.value;
    const EDIBLE_VALUE = EDIBLE.value;

    console.log(`Name:${NAME_VALUE} 1st:${FIRST_VALUE} 2nd:${SECOND_VALUE} E:${EDIBLE_VALUE}`);

    let obj = {
        name: NAME_VALUE,
        type1: FIRST_VALUE,
        type2: SECOND_VALUE,
        edible: EDIBLE_VALUE
    };

    // if statement to catch blank values for BM

    axios({
            method: "post",
            url: "http://localhost:8080/create",
            data: JSON.stringify(obj),
            headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
        })
        .then((resp) => {
            console.log(resp);
            ALERT.setAttribute("class", "alert alert-success");
            ALERT.innerHTML = "BurgerMon has been successfully created!";
            setTimeout(() => {
                window.location.reload();
                ALERT.removeAttribute("class");
                ALERT.innerHTML = "";
            }, 3000);
        })
        .catch((err) => {
            console.error(err.response)
        });
}

const updateBM = () => {

    const UPDATE_VALUE = UPDATE.value;
    const NAME_VALUE = UNAME.value;
    const FIRST_VALUE = UFIRSTITEM.value;
    const SECOND_VALUE = USECONDITEM.value;
    const EDIBLE_VALUE = UEDIBLE.value;

    console.log(`Name:${NAME_VALUE} 1st:${FIRST_VALUE} 2nd:${SECOND_VALUE} E:${EDIBLE_VALUE}`);

    let obj = {
        name: NAME_VALUE,
        type1: FIRST_VALUE,
        type2: SECOND_VALUE,
        edible: EDIBLE_VALUE
    };

    const upURL = `http://localhost:8080/update/${UPDATE_VALUE}`;

    console.log(upURL)

    axios({
            method: "put",
            url: upURL,
            data: JSON.stringify(obj),
            headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
        })
        .then((response) => {
            console.log(response);
            window.location.reload();
        })
        .catch((err) => {
            console.error(err.response);
        });
}

const deleteBM = () => {
    const DELETE_VALUE = DELETE.value;

    const delURL = `http://localhost:8080/remove/${DELETE_VALUE}`;

    console.log(delURL)

    axios({
            method: "delete",
            url: delURL,
            headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
        })
        .then((response) => {
            console.log(response);
            window.location.reload();
        })
        .catch((err) => {
            console.error(err.response);
        });
}

const printToScreen = (information) => {
    const p = document.createElement("p");

    const text = document.createTextNode(`${information.id}. Name: ${information.name} Items: ${information.type1} & ${information.type2} Edible: ${information.edible}`);

    p.appendChild(text);
    DISPLAY.appendChild(p);
}

const resetValues = () => {
    NAME.value = "";
    FIRSTITEM.value = "";
    SECONDITEM.value = "";
    EDIBLE.value = "";
}

const resetUpValues = () => {
    UPDATE.value = "";
    UNAME.value = "";
    UFIRSTITEM.value = "";
    USECONDITEM.value = "";
    UEDIBLE.value = "";
}

const clearScreen = () => {
    DISPLAY.innerHTML = "";
}