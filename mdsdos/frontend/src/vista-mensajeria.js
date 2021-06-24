import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaMensajeria extends PolymerElement {

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
 <label id="nombreBtn"></label>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; margin-top: 2%;">
  <label style="border:solid; align-self: center;" id="tituloLbl"></label>
  <vaadin-button theme="icon" aria-label="Add new" id="reloadBtn" style="background-color: #006400; border-radius: 40px 40px 40px 40px;">
   <iron-icon icon="lumo:reload"></iron-icon>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%;background-color:#778899"></vaadin-vertical-layout>
 <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-between;background-color :#374453">
  <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-start;">
   <vaadin-button id="enviadosBtn">
     Enviados 
   </vaadin-button>
   <vaadin-button id="recibidosBtn">
     Recibidos 
   </vaadin-button>
   <vaadin-button id="verMensajeBtn">
     Ver mensaje 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button id="responderBtn">
     Responder 
   </vaadin-button>
   <vaadin-button id="nuevoMensajeBtn">
     Nuevo mensaje 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajeria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajeria.is, VistaMensajeria);
