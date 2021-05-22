import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <label id="nombreBtn">Mensajes de nombre del empleado</label>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; margin-top: 2%;">
  <label style="border:solid" id="tituloLbl">Mensajes recibidos</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; margin-top: 2%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: flex-end;">
   <vaadin-button id="recibidosBtn">
     Recibidos 
   </vaadin-button>
   <vaadin-button id="enviadosBtn">
     Enviados 
   </vaadin-button>
   <vaadin-button id="verMensajeBtn">
    Ver mensaje
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vaadin-button id="nuevoMensajeBtn">
     Nuevo mensaje 
   </vaadin-button>
   <vaadin-button id="responderBtn">
     Responder 
   </vaadin-button>
  </vaadin-vertical-layout>
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
