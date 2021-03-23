import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="" style="width: 25%;">
  <img style="width: 80%; height: 25%; flex-grow: 0; align-self: center;">
  <vaadin-button style="align-self: center;" id="editImgBtn">
    Editar foto de perfil 
  </vaadin-button>
  <vaadin-horizontal-layout style="height: 10%; width: 100%;"></vaadin-horizontal-layout>
  <vaadin-button style="align-self: center;" id="createAccountBtn">
    Crear cuenta 
  </vaadin-button>
  <vaadin-button style="align-self: center;" id="cancelBtn">
    Cancelar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 75%; padding: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" style="height: 75%; width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; padding: var(--lumo-space-l);">
    <label style="font-weight: bold; align-self: stretch; font-size:30px; ">Datos personales:</label>
    <vaadin-text-field label="Usuario" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Nombre" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Apellidos" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Email" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-password-field label="Password" placeholder="Enter password" value="secret1"></vaadin-password-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; padding: var(--lumo-space-l);">
    <label style="font-weight: bold; align-self: stretch; font-size:30px; ">Direccion de envios</label>
    <vaadin-text-field label="Calle" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Numero" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Ciudad" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Provincia" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="C.P" placeholder="Placeholder"></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="height: 25%; width: 100%; padding: var(--lumo-space-l);">
   <label style="font-weight: bold; align-self: stretch; font-size:30px; ">Modo de pago</label>
   <vaadin-text-field label="Datos de pago"></vaadin-text-field>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-registro';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistro.is, VistaRegistro);
