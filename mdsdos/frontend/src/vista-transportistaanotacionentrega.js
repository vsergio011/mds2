import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaTransportistaanotacionentrega extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-end;">
 <vaadin-horizontal-layout style="justify-content: space-between; background-color:#232f3e; flex-grow: 0; flex-shrink: 1; width: 100%; height: 8%; padding: var(--lumo-space-m);">
  <img style="height: 70px; align-self: center; width: 70px;" src="https://image.freepik.com/free-vector/colorful-market-logo-with-gradient_23-2148472540.jpg">
  <vaadin-button id="btnExit" style="align-self: center; width: 20%; color:white; background-color:#374453;">
    exit 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 95%; height: 95%; align-self: center; align-items: center; justify-content: center; padding: var(--lumo-space-s); background-color:grey;">
  <label id="idPedido" style="align-self: flex-start; flex-shrink: 1; flex-grow: 1;">ID DEL PEDIDO</label>
  <vaadin-vertical-layout theme="spacing" id="containerPedido" style="align-self: center; width: 80%; height: 90%;background-color:white"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-button id="btnPedidoRecibido" style="align-self: center; border:solid; width: 90%;">
   Pedido Recibido 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportistaanotacionentrega';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportistaanotacionentrega.is, VistaTransportistaanotacionentrega);
