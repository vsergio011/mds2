import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaNuevomensaje extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <label>Creación de un nuevo mensaje</label>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center; align-items: center; border:solid; margin-top: 5%;">
  <vaadin-text-field label="Asunto" placeholder="Placeholder" style="width: 90%;"></vaadin-text-field>
  <vaadin-text-field label="Destinatario" placeholder="Placeholder" style="width: 90%;"></vaadin-text-field>
  <vaadin-text-area label="Mensaje" placeholder="Add detailed explanation" style="width: 90%;"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; justify-content: flex-end;">
  <vaadin-button>
   Enviar mensaje
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-nuevomensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaNuevomensaje.is, VistaNuevomensaje);
