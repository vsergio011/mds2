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
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <label id="titleLbl">Creación de un nuevo mensaje</label>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center; align-items: center; margin-top: 5%; background-color:#f5f5f5
">
  <vaadin-text-field label="Asunto" placeholder="Placeholder" style="width: 90%;" id="asuntoInput"></vaadin-text-field>
  <vaadin-text-field label="Remitente" placeholder="Placeholder" id="remitenteInput" style="width: 90%;">
    Remitente 
  </vaadin-text-field>
  <vaadin-text-field label="Destinatario" placeholder="Placeholder" style="width: 90%;" id="destinatarioInput"></vaadin-text-field>
  <vaadin-text-area label="Mensaje" placeholder="Add detailed explanation" style="width: 90%;" id="mensajeInput"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="align-self: center; justify-content: space-between; width: 80%;">
  <vaadin-button id="responderBtn" style="background-color: #006400; color:white; padding: var(--lumo-space-s);border-radius: 40px 40px 40px 10px;">
    Responder 
  </vaadin-button>
  <vaadin-button id="enviarBtn" style="border-radius: 40px 40px 10px 40px; padding: var(--lumo-space-xs);color:white;background-color:#006400">
    Enviar 
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
