import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPerfil extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);">
 <vaadin-vertical-layout theme="spacing" style="width: 60%; align-items: center;">
  <img src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg" style="align-self: center; width: 40%; height: 40;">
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <vaadin-button>
    Cambiar imagen de perfil
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Cambiar contraseña
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Modificar datos
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Compras realizadas
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Contacto 
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Borrar cuenta 
   </vaadin-button>
   <vaadin-button style="width: 100%;">
    Desconectar
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <label style="font-size: 30px; font-weight: bold;">Nombre y apellidos del usuario</label>
  <label>Correo Electrónico: usuario@correo.com</label>
  <label>Direccion Postal:</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-perfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPerfil.is, VistaPerfil);
