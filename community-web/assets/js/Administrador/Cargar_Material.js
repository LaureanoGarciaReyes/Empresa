
function Elegir(){

    document.getElementById('Buscar').click();
}
function Seleccionar1(){

    document.getElementById('AreaMaterial').disabled = false;
}
function Guardar(){
   
    Swal.fire({
        title: '¿Desea guardar los cambios?',
        showDenyButton: true,
        confirmButtonText: 'Guardar',
        confirmButtonColor: '#19e619',
        denyButtonText: 'Cancelar',
        icon:'question',
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
         Swal.fire('¡Guardado!', '', 'success')
         document.getElementById("AreaMaterial").disabled = true;
         document.getElementById("bttnElegir").disabled= true;
         document.getElementById("bttnGuardar").disabled = true;
        } else if (result.isDenied) {
          Swal.fire('¡Cambio no guardado! ', '', 'error')
        }
      })
    
}