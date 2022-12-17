window.onload = function () {
    debugger;
    diploma.Init();
}

let diploma = {

    // Declaracion de controles
    listTalleres: document.getElementById("listTalleres"),
    diploma: document.getElementById("Diploma"),
    diploma: document.getElementById("contentTodosTalleres"),

    // Declaracion de funciones o metodos
    Init: function() {
        debugger;
        this.ConfigurarEventos();
    },

    ConfigurarEventos: function() {
        debugger;
        this.listAlumnos.querySelectorAll(".dropdown-item").forEach(function(taller) {
            taller.addEventListener("click", diploma.SeleccioneunAlumno);
        });
    },
    
    SeleccioneunTaller: function() {

        debugger;
        const text = this.innerHTML;
        if(text == "Todos los Talleres") {
            // Mostrar la tabla
            diploma.diploma.classList.add("visually-hidden");
            calendario.contentTodosTalleres.classList.remove("visually-hidden");
        }
        else {
            // Mostrar el calendario del taller seleccionado
            diploma.diploma.classList.remove("visually-hidden");
            calendario.contentTodosTalleres.classList.add("visually-hidden");
            
        } 
        

        // try {
        //     debugger;
        //     const inputs = document.querySelectorAll(" #bttnTodoslosTalleresModal, #bttnScrumMasterModa,#bttnProductOwnerModal,#bttnKanbanModal,#bttnDesingThingModal");
        //     for (let input of inputs) {
        //         input.removeAttribute("disabled");
        //     }

        //     bttnEditar.setAttribute("disabled", "");

        // } catch (error) {
        //     Swal.fire({
        //         icon: 'error',
        //         title: 'Error...',
        //         text: 'Fallo al habilitar los campos para Editar, favor de contactar al administrador'
        //       });
        // }

    }

}