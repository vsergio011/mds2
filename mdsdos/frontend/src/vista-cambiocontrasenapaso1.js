import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCambiocontrasenapaso1 extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 40%; align-self: center; padding: var(--lumo-space-l); justify-content: center;">
  <label style="font-weight: bold; align-self: center; margin: var(--lumo-space-s);">Cambio de contrase�a</label>
  <label style="align-self: center; font-size: 13px; flex-grow: 0; width: 85%;">Se ha enviado un mensaje a su cuenta de correo con un numero de acceso. Copielo en el siguiente cuadro y pulse continuar: </label>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; padding: var(--lumo-space-l);">
   <label style="align-self: center; width: 70%;">Numero de verificacion </label>
   <vaadin-button id="sendBtn">
     Enviar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cambiocontrasenapaso1';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCambiocontrasenapaso1.is, VistaCambiocontrasenapaso1);
