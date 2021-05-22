import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaDetallemensaje extends PolymerElement {

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
 <label>Asunto mensaje</label>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;border:solid">
  <label id="remitentelvl">01/03/2021|remitente </label>
  <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center; border:solid; margin: var(--lumo-space-xl);" id="textLbl">
   <label id="mensajeLbl">texto del mensaje</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; justify-content: flex-end;">
  <vaadin-button id="enviarBtn">
   Enviar
  </vaadin-button>
  <vaadin-button id="responderMensajeBtn">
   Responder 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-detallemensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDetallemensaje.is, VistaDetallemensaje);
