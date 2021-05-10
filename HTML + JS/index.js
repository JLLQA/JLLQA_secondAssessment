'use strict'
const NAME = document.querySelector("#Name");
const FIRSTITEM = document.querySelector("#firstItem");
const SECONDITEM = document.querySelector("#secondItem");
const EDIBLE = document.querySelector("#edible");
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
    let EDIBLE_VALUE;
    if (EDIBLE.value == "no") {
        EDIBLE_VALUE = false;
    }
    else {
        EDIBLE_VALUE = true;
    }

    console.log(`Name:${NAME_VALUE} 1st:${FIRST_VALUE} 2nd:${SECOND_VALUE} E:${EDIBLE_VALUE}`);

    let obj = {
        name: NAME_VALUE,
        type1: FIRST_VALUE,
        type2: SECOND_VALUE,
        edible: EDIBLE_VALUE
    };

    // if statement to catch blank values for BM

    axios({
        method: "post", url: "http://localhost:8080/create", data: JSON.stringify(obj), headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
    })
        .then((resp) => {
            console.log(resp);
            ALERT.setAttribute("class", "alert alert-success");
            ALERT.innerHTML = "BurgerMon has been successfully created!";
            setTimeout(() => {
                ALERT.removeAttribute("class");
                ALERT.innerHTML = "";
                window.location.reload();
            }, 3000);
        })
        .catch((err) => {
            console.error(err.response)
        });
}

// const updateBM = () => {
//     const UPDATE_VALUE = UPDATE.value;
//     const NAME_VALUE = NAME.value;
//     const FIRST_VALUE = FIRSTITEM.value;
//     const SECOND_VALUE = SECONDITEM.value;
//     let EDIBLE_VALUE;
//     if (EDIBLE.value == "no") {
//         EDIBLE_VALUE = false;
//     }
//     else {
//         EDIBLE_VALUE = true;
//     }

//     console.log(`Name:${NAME_VALUE} 1st:${FIRST_VALUE} 2nd:${SECOND_VALUE} E:${EDIBLE_VALUE}`);

//     let obj = {
//         name: NAME_VALUE,
//         type1: FIRST_VALUE,
//         type2: SECOND_VALUE,
//         edible: EDIBLE_VALUE
//     };

//     const upURL = `http://localhost:8080/update/${UPDATE_VALUE}`;

//     console.log(upURL)

//     axios({
//         method: "delete", url: upURL, data: JSON.stringify(obj), headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
//     })
//         .then((response) => {
//             console.log(response);
//             window.location.reload();
//         })
//         .catch((err) => {
//             console.error(err.response);
//         });
// }

const deleteBM = () => {
    const DELETE_VALUE = DELETE.value;

    const delURL = `http://localhost:8080/remove/${DELETE_VALUE}`;

    console.log(delURL)

    axios({
        method: "delete", url: delURL, headers: { "Access-Control-Allow-Origin": "*", "Content-Type": "APPLICATION/JSON" }
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
    console.log(information.edible);
    let EDIBLE_OUT;
    if (information.edible == "false") {
        EDIBLE_OUT = no;
    }

    // const text = document.createTextNode(`${information.id}. Name: ${information.name} Types: ${information.type1} & ${information.type2} Edible: ${information.edible}`);
    const text = document.createTextNode(`${information.id}. Name: ${information.name} Types: ${information.type1} & ${information.type2} Edible: ${EDIBLE_OUT}`);

    p.appendChild(text);
    DISPLAY.appendChild(p);
}

const resetValues = () => {
    NAME.value = "";
    FIRSTITEM.value = "";
    SECONDITEM.value = "";
}

const clearScreen = () => {
    DISPLAY.innerHTML = "";
}