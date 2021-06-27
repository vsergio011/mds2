import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaTransportista extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width:50%
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="justify-content: space-between; background-color:#232f3e; flex-grow: 0; flex-shrink: 1; width: 100%; height: 8%; padding: var(--lumo-space-m);">
  <img style="height: 70px; align-self: center; width: 70px;" src="https://image.freepik.com/free-vector/colorful-market-logo-with-gradient_23-2148472540.jpg">
  <vaadin-button id="cerrarSesionBtn" style="align-self: center; width: 30%;color:white; background-color:#374453; ">
    Cerrar sesion 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%;" id="containerPrincipal"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportista.is, VistaTransportista);
