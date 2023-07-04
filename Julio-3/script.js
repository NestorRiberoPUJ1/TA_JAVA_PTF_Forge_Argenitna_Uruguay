

function clicked(element) {
    const tema = element.parentNode.innerText
    console.log(tema, element.checked);
    const pendientes = document.getElementById("pendientes");
    console.log(pendientes);
    const num = parseInt(pendientes.innerText);
    console.log(num);
    if (element.checked) {
        pendientes.innerText = num - 1;
    }
    else {
        pendientes.innerText = num + 1;
    }
}