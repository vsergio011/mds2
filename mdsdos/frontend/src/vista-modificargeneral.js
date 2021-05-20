import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaModificargeneral extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 60%; align-items: center;">
  <img src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg" style="align-self: center; width: 40%; height: 40;" id="img">
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <vaadin-button id="cambiarImagenBtn">
     Cambiar imagen de perfil 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="cambiarPasswordBtn">
     Cambiar contraseña 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="modificarDatosBtn">
     Modificar datos 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="comprasBtn">
     Compras realizadas 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="contactoBTn">
     Contacto 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="borrarCuentaBtn">
     Borrar cuenta 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="desconectarBtn">
     Desconectar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; padding: var(--lumo-space-xl);">
  <vaadin-text-field label="Nombre de usuario" placeholder="Placeholder" id="lbNombreUsuario" style="width: 90%;"></vaadin-text-field>
  <vaadin-text-field label="Nombre" placeholder="Placeholder" style="width: 90%;" id="lbNombre"></vaadin-text-field>
  <vaadin-text-field label="Apellidos" placeholder="Placeholder" style="width: 90%;" id="lbApellidos"></vaadin-text-field>
  <vaadin-text-field label="email" placeholder="Placeholder" style="width: 90%;" id="lbEmail"></vaadin-text-field>
  <vaadin-text-field label="Direccion completa" placeholder="Placeholder" style="width: 90%;" id="lbDireccion"></vaadin-text-field>
  <vaadin-text-field label="Datos de pago" placeholder="Placeholder" style="width: 90%;" id="lbDatosDePago"></vaadin-text-field>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-modificargeneral';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificargeneral.is, VistaModificargeneral);