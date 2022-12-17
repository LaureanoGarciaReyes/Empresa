function Activar() {
  document.getElementById("SE-IDTaller").disabled = false;
  document.getElementById("grupo").disabled = false;
  document.getElementById("Hora").disabled = false;
  document.getElementById("txtPlataforma").disabled = false;
  document.getElementById("SE-Trainer").disabled = false;
  document.getElementById("Fecha").disabled = false;
  document.getElementById("txtReunion").disabled = false;
  document.getElementById("txtPass").disabled = false;
  document.getElementById("bttnAgregar").disabled = false;
  document.getElementById("bttnEliminar").style.display = '';
  document.getElementById("bttnGuardar").disabled = false;

}
function Guardar() {
  Swal.fire({
    title: '¿Desea guardar los cambios?',
    showDenyButton: true,
    confirmButtonText: 'Guardar',
    confirmButtonColor: '#19e619',
    denyButtonText: 'Cancelar',
    icon: 'question',
  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      Swal.fire('¡Guardado!', '', 'success')
      document.getElementById("SE-IDTaller").disabled = true;
      document.getElementById("grupo").disabled = true;
      document.getElementById("Hora").disabled = true;
      document.getElementById("txtPlataforma").disabled = true;
      document.getElementById("SE-Trainer").disabled = true;
      document.getElementById("Fecha").disabled = true;
      document.getElementById("txtReunion").disabled = true;
      document.getElementById("txtPass").disabled = true;
      document.getElementById("bttnAgregar").disabled = true;
      document.getElementById("bttnEliminar").style.display = 'none';
      document.getElementById("bttnGuardar").disabled = true;

    } else if (result.isDenied) {
      Swal.fire('¡Cambio no guardado! ', '', 'error')
    }
  })

}
function Eliminar() {
  Swal.fire({
    title: 'Esta seguro de eliminar el registro',
    text: "¡No podrá revertir esta acción!",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#19e619',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Confirmar',
    cancelButtonText: 'Cancelar'
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire(
        'Eliminado',
        'El registro ha sido eliminado',
        'success'
      )
      document.getElementById("SE-IDTaller").disabled = true;
      document.getElementById("grupo").disabled = true;
      document.getElementById("Hora").disabled = true;
      document.getElementById("txtPlataforma").disabled = true;
      document.getElementById("SE-Trainer").disabled = true;
      document.getElementById("Fecha").disabled = true;
      document.getElementById("txtReunion").disabled = true;
      document.getElementById("txtPass").disabled = true;
      document.getElementById("bttnAgregar").disabled = true;
      document.getElementById("bttnEliminar").style.display = 'none';
      document.getElementById("bttnGuardar").disabled = true;
    }
  })

}
function CrearSesion() {

  /*-------------SESIÓN-------------------*/

  var sesion = document.createElement('h5');
  sesion.textContent = 'Sesión'
  sesion.classList.add('m-3')
  Datos.append(sesion);

  /*---------Crear sesión FECHA------------*/
  var divini = document.createElement('div');
  divini.classList.add('row', 'mt-3');
  Datos.append(divini)

  var valor1 = document.createElement('div');
  valor1.classList.add('col-sm-12', 'col-md-3', 'col-lg-3');
  divini.append(valor1)

  var Fecha = document.createElement('label');
  Fecha.textContent = 'Fecha'
  Fecha.classList.add('sc-label');
  valor1.append(Fecha)

  var valor2 = document.createElement('div');
  valor2.classList.add('col-sm-12', 'col-md-9', 'col-lg-9');
  divini.append(valor2)

  var input1 = document.createElement('input');
  input1.type = "date";
  input1.classList.add('form-control');
  valor2.append(input1)

  /*---------Crear sesión ID-REUNION------------*/
  var div_ini = document.createElement('div');
  div_ini.classList.add('row', 'mt-3');
  Datos.append(div_ini)

  var divID = document.createElement('div');
  divID.classList.add('col-sm-12', 'col-md-3', 'col-lg-3');
  div_ini.append(divID)

  var ID = document.createElement('label');
  ID.textContent = 'ID de reunión'
  ID.classList.add('sc-label');
  divID.append(ID)

  var divID1 = document.createElement('div');
  divID1.classList.add('col-sm-12', 'col-md-9', 'col-lg-9');
  div_ini.append(divID1)

  var input2 = document.createElement('input');
  input2.type = "text";
  input2.classList.add('form-control');
  divID1.append(input2)

  /*---------Crear sesión ID-REUNION------------*/
  var div_ini1 = document.createElement('div');
  div_ini1.classList.add('row', 'mt-3');
  Datos.append(div_ini1)

  var divPass = document.createElement('div');
  divPass.classList.add('col-sm-12', 'col-md-3', 'col-lg-3');
  div_ini1.append(divPass)

  var passcode = document.createElement('label');
  passcode.textContent = 'Passcode'
  passcode.classList.add('sc-label');
  divPass.append(passcode)

  var divPass1 = document.createElement('div');
  divPass1.classList.add('col-sm-12', 'col-md-9', 'col-lg-9');
  div_ini1.append(divPass1)

  var Pass = document.createElement('input');
  Pass.type = "text";
  Pass.classList.add('form-control');
  divPass1.append(Pass)


}
